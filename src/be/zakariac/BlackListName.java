package be.zakariac;

public enum BlackListName {
    ALLAH, DIEU, GOD, HITLER, JUIF;

    public static boolean contains(String name){

        for (BlackListName value : BlackListName.values()){
            if(value.toString().equalsIgnoreCase(name)){
                return true;
            }
         }
        return false;
    }



}

