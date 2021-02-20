/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if1.pkg10119010.maulanaimammalik.pkg3;

/**
 *
 * @author MIM
 */
public class StatusDewasa {
    private int umur;
    private String status;

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String statusumur(int umur){
        if (umur >= 0 && umur <= 16){
            status = "false";
        }
        else if (umur > 16){
            status = "true";
        }

        return status;
    }
}
