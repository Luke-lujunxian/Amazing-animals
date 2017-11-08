public class Event {
    public Individual reproduc(Individual a,Individual b){
        //int swichPoint = (int)(Math.random()*20);

        Individual newSon = new Individual();

        for  (int i=0;i<newSon.gean.length;i++){
           double choose = Math.random();
            if(choose>=0.5)
                newSon.gean[i]=a.gean[i];
            else
                newSon.gean[i]=b.gean[i];
        }
        /*对每个基因随机选择组合*/

        //废弃代码
        //System.arraycopy(a.gean,0,newSon.gean,0,swichPoint);
        //System.arraycopy(b.gean,swichPoint,newSon.gean,swichPoint,b.gean.length - swichPoint-1);

        return newSon;
    }
}
