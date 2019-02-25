package me.vital.commons;

public class MoeCalculator {

    private Double number_x;
    private Double number_y;
    private String error_message;
    private String result;
    private boolean checked;

    public MoeCalculator(String number_x, String number_y) {
        try {
            this.number_y = Double.parseDouble(number_y);
            this.number_x = Double.parseDouble(number_x);
            this.checked = true;
        } catch(NumberFormatException nfe) {
            this.error_message = "Please, Digit a valid number";
            this.checked = false;
        }
    }

    public void sum_(){
        if(this.checked){
            Double sum = (this.number_x + this.number_y);
            this.result = Double.toString(sum);
        }
    }

    public void subtract(){
        if(this.checked){
            Double subtract = (this.number_x - this.number_y);
            this.result = Double.toString(subtract);
        }
    }

    public String get_result(){
        if(this.checked){
            return this.result;
        }
        return this.error_message;
    }

}
