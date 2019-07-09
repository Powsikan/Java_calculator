package com.company.v3.Inputs;


public class CMDLineinputs implements Inputs {

    private String Argument[];
    public CMDLineinputs(String args[]){
        this.Argument=args;
    }



    @Override
    public String read() {

        return Argument[0] ;
    }
}
