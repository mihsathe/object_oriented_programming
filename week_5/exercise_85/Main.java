public class Main {
    
    public static void main(String[] args) {
        Reformatory eastHelsinkiReformatory = new Reformatory();
        
        Person personA = new Person("A", 1, 110, 7);
        Person personB = new Person("B", 33, 176, 85);
        
        System.out.println(personA.getName() + " weight: " + eastHelsinkiReformatory.weight(personA) + " killos");
        System.out.println(personB.getName() + " weight: " + eastHelsinkiReformatory.weight(personB) + " killos");
        
        eastHelsinkiReformatory.feed(personB);
        eastHelsinkiReformatory.feed(personB);
        eastHelsinkiReformatory.feed(personB);
        
        System.out.println("");
        
        System.out.println(personA.getName() + " weight: " + eastHelsinkiReformatory.weight(personA) + " killos");
        System.out.println(personB.getName() + " weight: " + eastHelsinkiReformatory.weight(personB) + " killos");
        
        System.out.println("total weight measured: " + eastHelsinkiReformatory.totalWeightsMeasured());
        
        eastHelsinkiReformatory.weight(personA);
        eastHelsinkiReformatory.weight(personB);
        
        System.out.println("total weight measured: " + eastHelsinkiReformatory.totalWeightsMeasured());
    }
}