package com.jap.validator;

public class CredentialsValidatorImpl {
    public static void main(String[] args) {
        CredentialsValidatorImpl obj = new CredentialsValidatorImpl();
        String result = obj.validateUser("user", "1234");
        System.out.println("result = " + result);
    }

    public String validateUser(String name, String password) {
        CredentialsValidator credentialsValidator = (o1, o2) -> {
            if (name.equals("admin") && password.equals("1234")) {
                return "valid user";
            } else {
                return "invalid user";
            }
        };
        return credentialsValidator.validator(name, password);
    }
}
