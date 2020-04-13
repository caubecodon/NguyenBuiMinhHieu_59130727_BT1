/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

import interfaces.IQLDS;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Bui Minh Hieu
 */
public class QLDS implements IQLDS {
    // thuoc tinh
    private ArrayList<CaNhan> dsCaNhan = new ArrayList<>();

    // constructor
    public QLDS(ArrayList<CaNhan> dsCaNhan) {
        this.dsCaNhan = dsCaNhan;
    }
    
    // methods
    // them ca nhan
    @Override
    public int them(CaNhan cn) {
      dsCaNhan.add(cn);
      return 1;
    }

    // in ds ca nhan
    @Override
    public void inDS() {
      dsCaNhan.forEach(cn -> System.out.println(cn.hienThiTT()));
    }
}