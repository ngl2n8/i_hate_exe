
public class Main {
    public static void main(String[] args)throws wrongLoginException {
        char a ='a';
        char b ='A';
        char z = 'z';
        char Z = 'Z';

        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println((int)z);
        System.out.println((int)Z);
        System.out.println((char)95);
        System.out.println();
        qwe myClass = new qwe();
        try {
            myClass.yaPrinimayuTriParametra("Qwe123_1__0", "223", "223");
        }catch (wrongLoginException ex){
            System.out.println(ex.getMessage());
        }catch (wrongPasswordException ex){
            System.out.println(ex.getMessage());
        }
    }
//    static void yaPrinimayuTriParametra(String login, String password, String confirmPassword){
//        boolean qwe=true;
//        for(char a: login.toCharArray()){
//            qwe = (a>122||a<48)&&(a>57&&a>122||a>48&&a!=95)?qwe=false:Boolean.TRUE;
//            System.out.println(qwe);
//        }
//
//    }
}