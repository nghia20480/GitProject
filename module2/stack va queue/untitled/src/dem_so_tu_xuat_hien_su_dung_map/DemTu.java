package dem_so_tu_xuat_hien_su_dung_map;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class DemTu {


    public static void main(String[] args) {


            Map<String,Integer>  map=new HashMap<String,Integer>();
            map.put("toi",1);
            map.put("nam",2);
            map.put("nay",3);
            map.put("hon",4);
            map.put("bay",7);
            map.put("muoi",5);
            map.put("tuoi",5);
            String chuoi="toi xin chao muoi muoi";
            String[] chuoi1 = chuoi.split(" ");
        for (int i = 0; i < chuoi1.length ; i++) {
            chuoi1[i].toLowerCase();
            String tu=chuoi1[i].toString();
            if (map.containsKey(tu)){
                int valueMoi=map.get(chuoi1[i])+1;
                map.put(chuoi1[i],valueMoi);
            } else {
                map.put(chuoi1[i],1);
            }
        }
        Set set=map.keySet();
        for(Object key:set){
            System.out.println(key+" "+ map.get(key));
        }



    }
}








