package me.vital.moecalculator.utils;

public class MoeCalculator {

    private Double number_x;
    private Double number_y;

    public boolean init(String number_x, String number_y){
        try {
            this.number_y = Double.parseDouble(number_y);
            this.number_x = Double.parseDouble(number_x);
        } catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public Double sum_(){
        return(this.number_x + this.number_y);
    }

    public Double subtract(){
        return(this.number_y - this.number_x);
    }

}
