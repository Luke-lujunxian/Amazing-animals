public class Event {
    public Individual reproduc(Individual a,Individual b){
        int swichPoint = (int)Math.random()*20;
        Individual newSon = new Individual();
        System.arraycopy(a.gean,0,newSon.gean,0,swichPoint);
        System.arraycopy(b.gean,swichPoint,newSon.gean,swichPoint,b.gean.length - swichPoint-1);

        return newSon;
    }
}
