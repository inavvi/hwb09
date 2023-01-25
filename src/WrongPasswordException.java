public class WrongPasswordException extends Exception {

    public WrongPasswordException () {
        //System.out.println("Ошибка С! Нарушено правило написания логина или пароля!");
    }

    public WrongPasswordException (String message) {
       // message="Ошибка С! Нарушено правило написания логина или пароля!";
        super(message);
    }

}
