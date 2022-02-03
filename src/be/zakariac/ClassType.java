package be.zakariac;

public enum ClassType {

    GUERRIER, MAGE;

    public static boolean contains(String type){

        for (ClassType value : values()){
            if(value.toString().equalsIgnoreCase(type)){
                return true;
            }
        }
        return false;
    }

    public static void returnType(){

        for(ClassType classtype : ClassType.values()){
            System.out.println(classtype);
        }
    }

}
