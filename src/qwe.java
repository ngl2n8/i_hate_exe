public class qwe {
    void yaPrinimayuTriParametra(String login, String password,String confirmPassword) throws wrongLoginException, wrongPasswordException {
        if(login.toCharArray().length>19||proverka(login)==false)throw new wrongLoginException("неправильный логин",login);
        if(!password.equals(confirmPassword) ||proverka(password)==false) throw new wrongPasswordException("parol`",confirmPassword);
    }
    boolean proverka(String string){
        boolean qwe=true;
        for(char a: string.toCharArray()){qwe = (a>122||a<48)&&(a>57&&a>122||a>48&&a!=95)?qwe=false:true;}
        if(qwe==false)return false;
        return true;
    }

}
class wrongLoginException extends Exception{
    private String login;
    public String getString(){return login;}
    public wrongLoginException(String massage,String login){
        super(massage);
        this.login= login;
    }
    public wrongLoginException(Exception ex){
        Exception exception = new Exception(ex.getMessage());
    }

}
class wrongPasswordException extends Exception{
    private String password;
    public String getString(){return password;}
    public wrongPasswordException(String massage,String password){
        super(massage);
        this.password= password;
    }
    public wrongPasswordException(Exception ex){
        Exception exception = new Exception(ex.getMessage());
    }
}
