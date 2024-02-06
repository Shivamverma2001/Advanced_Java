import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Mobile{
    String model;
    String os;
    int  ram;
    Mobile(String model,String os,int ram){
        this.model=model;
        this.os=os;
        this.ram=ram;
    }
}
public class PartitionByGroupByDemo {
    public static void main(String[] args) {
        List<Mobile> mobiles=Arrays.asList(
                                    new Mobile("iphone 7","ios",6),
                                    new Mobile("mi 9","android",7),
                                    new Mobile("galaxy s10","android",8),
                                    new Mobile("redmi 8","android",9),
                                    new Mobile("macbook pro","mac",4)
                                    );
        
        Map<Boolean,List<Mobile>> mp=mobiles.stream()
                                    .sorted((m1,m2)->m2.ram>m1.ram?1:-1)
                                    .collect(Collectors.partitioningBy(e->e.os.equals("android")));

        Map<String,List<Mobile>> mp1=mobiles.stream()
                                    .sorted((m1,m2)->m1.ram > m2.ram ? 1:-1)
                                    .collect(Collectors.groupingBy(e->e.os));

        
        List<Mobile> ls=mp.get(true);
        List<Mobile> ls1=mp1.get("android");

        for(Mobile m:ls){
            System.out.println(m.model+" "+m.os+" "+m.ram);
        }
        for(Mobile m:ls1){
            System.out.println(m.model+" "+m.os+" "+m.ram);
        }
    }
}
