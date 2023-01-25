public class Users {

    private static final String AVAILABLE_CHARACTERS = "_0123456789aAbBcCdDeEfFgGhHiIkKlLmMnNoOpPqQrRsStTvVxXyYzZ";

    private String login;
    private String password;
    private String confirmPassword;


    public Users(String login, String password, String confirmPassword) {
        if (checkingCorrect(login)) {
            this.login = login;
        }
        if (checkingCorrect(password)) {
            this.password = password;
        }
        if (password.equals(confirmPassword)) {
            this.confirmPassword = confirmPassword;
        } else {
            System.out.println("Ошибка! Пароли не равны!");
        }
    }


    public void logIn(String login, String password, Car car) {
        if (login.equals(this.login) && password.equals(this.password)) {
            System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getColor() + " открыта!");
        } else {
            System.out.println("Неверно введён логин или прароль!");
        }
    }

    private static boolean checkingCorrect(String s) {
        if (s.length() > 20) {
            System.out.println("Ошибка 20! Нарушено правило написания логина или пароля!");
        return false;}

        for(int i = 0; i<s.length();i++) {
        if (!AVAILABLE_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
            System.out.println("Ошибка С! Нарушено правило написания логина или пароля!");
            return false;}
        }
        return true;
    }



    public boolean checkLogin() throws WrongLoginException {

        if (getLogin().length()<=20) {
            System.out.println(getLogin()+" проверка завершена!");
        } else { throw new WrongLoginException(getLogin()+" Ошибка 20! Нарушено правило написания логина!");}
        return true;
    }

    public static void checkUsers (Users... users) {
        int count=0;
        try {
            for (Users users1: users) {
                users1.checkLogin();
                count++;
            } } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } finally { System.out.println(count);}
        }

        public void printUser(){
        System.out.println(getLogin()+getPassword());

    }


    public String getLogin() {
        return login;}

    public String getPassword() {
        return password;}
}
