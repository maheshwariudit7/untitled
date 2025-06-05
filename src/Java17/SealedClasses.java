package Java17;

public sealed class SealedClasses permits Circle, Rectangle, Square {

}

class Main{

    public void processShape(SealedClasses sealedClasses){

        if(sealedClasses instanceof Circle circle){
            System.out.println("circle instance");
        }else if(sealedClasses instanceof Rectangle rectangle){
            System.out.println("rectangle instance");
        }else if(sealedClasses instanceof Square s) {
            System.out.println("square instance");
        }
    }
// java 17 does not support pattern matching without enabling preview flag

//    public void processShapeSwitch(SealedClasses s){
//
//        switch (s){
//            case Circle circle -> circle.draw();
//                break;
//            case Rectangle rectangle -> {
//
//                rectangle.draw();
//                if(rectangle instanceof TransparentRectangle tr)
//                    System.out.println("TransparentRectangle instance");
//                else if(rectangle instanceof  FilledRectangle fr)
//                    System.out.println("FilledRectangle instance");
//            }
//            case Square square -> square.draw();
//            default -> System.out.println("Unknown instance");
//        }
//    }


    public static void main(String[] args) {

        SealedClasses s = new TransparentRectangle();
        Main m = new Main();
        m.processShape(s);

//        m.processShapeSwitch(s);
    }
}


final class Circle extends SealedClasses {

    public void draw() {
        System.out.println("drawing square");
    }

}

non-sealed class Square extends SealedClasses {
    public void draw() {
        System.out.println("drawing square");
    }

}

sealed class Rectangle extends SealedClasses permits TransparentRectangle, FilledRectangle {

    public void draw(){
        System.out.println("Rectangle type instance");
    }

}

final class TransparentRectangle extends Rectangle {

    public void draw(){
        System.out.println("it is a TransparentTriangle");
    }

}

final class FilledRectangle extends Rectangle {

    public void draw(){
        System.out.println("it is a FilledRectangle");
    }

}




