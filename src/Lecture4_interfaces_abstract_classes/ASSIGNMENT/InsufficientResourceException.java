package Lecture4_interfaces_abstract_classes.ASSIGNMENT ;

public class InsufficientResourceException extends RuntimeException {
    public InsufficientResourceException(String message) {
        super(message);
    }

}
