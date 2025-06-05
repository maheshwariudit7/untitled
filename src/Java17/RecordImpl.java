package Java17;

import java.net.UnknownServiceException;

public class RecordImpl {

    public static void main(String[] args) {

//        UserRecord record1 = new UserRecord("cde",0);
        UserRecord record = new UserRecord("abc",25);

        System.out.println(record.name());
        System.out.println(record.id());

        System.out.println(UserRecord.invalidId);
        record.instanceFunc();

        UserRecord.staticFunc();

        System.out.println(record);


    }
}

record UserRecord(String name, int id){

    public UserRecord(String name,int id){
        this.name=name;

        if(id < 1){
            throw new IllegalArgumentException("Invalid user id");
        }else{
            this.id=id;
        }
    }

    public static final String invalidId = "Invalid ID";

    public static void staticFunc(){
        System.out.println("Static record function");
    }

    public void instanceFunc(){
        System.out.println("Instance record function");
    }

}
