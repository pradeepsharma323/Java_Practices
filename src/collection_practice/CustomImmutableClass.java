package collection_practice;

public final class CustomImmutableClass {

    //1. make class final so other can't inherit

    //2. make data member final so once we define its value can't be changed

    final String panCardNumber;

    public CustomImmutableClass(String panCardNumber) {
        this.panCardNumber = panCardNumber;
    }

    //3. create parameterized constructors above

    //4. have only getter method not setter to avoid external system to change its value

    public String getPanCardNumber(){
        return panCardNumber;
    }

    public static void main(String[] args) {
        CustomImmutableClass customImmutableClass = new CustomImmutableClass("EXPSOA234K");
        String panCard=customImmutableClass.getPanCardNumber();
        System.out.println("Immutable class called and pan card is:"+panCard);
    }
}
