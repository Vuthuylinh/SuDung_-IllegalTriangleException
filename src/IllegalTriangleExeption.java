public class IllegalTriangleExeption extends Exception {

    String errorMessage;
    public IllegalTriangleExeption(String inErrorMessage){
        super();
        this.errorMessage = inErrorMessage;
    }
    public String getString(){
        return this.errorMessage;
    }
}
