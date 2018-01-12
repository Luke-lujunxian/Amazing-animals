public class MeaningBehindGene {


    public static int AfterDecodeNeedOfMoisture(int needOfMoisture){
        if(needOfMoisture==1) return 0;
        if(needOfMoisture==2) return 10;
        if(needOfMoisture==3) return 20;
        if(needOfMoisture==4) return 30;
        if(needOfMoisture==5) return 40;
        if(needOfMoisture==6) return 50;
        if(needOfMoisture==7) return 60;
        if(needOfMoisture==8) return 70;
        else return 0;
    }

    public static String AfterDecodeNeedOfFood(int needOfFood){
        if(needOfFood==1) return "单一丰富";
        if(needOfFood==2) return "单一还行";
        if(needOfFood==3) return "单一稀少";
        if(needOfFood==4) return "单一缺乏";
        if(needOfFood==5) return "多样缺乏";
        if(needOfFood==6) return "多样稀少";
        if(needOfFood==7) return "多样还行";
        if(needOfFood==8) return "多样丰富";
        else return "";
    }
    public static int AfterDecodeneedOfTemepratureFirstPart(int needOfTemeprature){
        if(needOfTemeprature==1) return -60;
        if(needOfTemeprature==2) return -30;
        if(needOfTemeprature==3) return 0;
        if(needOfTemeprature==4) return 20;
        if(needOfTemeprature==5) return 30;
        if(needOfTemeprature==6) return 40;
        if(needOfTemeprature==7) return 45;
        if(needOfTemeprature==8) return 50;
        else return 0;
    }
    public static int AfterDecodeneedOfTemepratureSecondPart(int needOfTemeprature){
        if(needOfTemeprature==1) return -30;
        if(needOfTemeprature==2) return 0;
        if(needOfTemeprature==3) return 20;
        if(needOfTemeprature==4) return 30;
        if(needOfTemeprature==5) return 40;
        if(needOfTemeprature==6) return 45;
        if(needOfTemeprature==7) return 50;
        if(needOfTemeprature==8) return 100;
        else return 0;
    }

    public static int AfterDecodeSpeed(int speed){

        if(speed<1||speed>8){
            return 0;
        }
        else{
            for(int i=1;i<=8;i++){
                if(speed==i) return i;
            }
        }
        return 0;
    }
    public static int AfterDecodeDuration(int duration){

        if(duration<1||duration>8){
            return 0;
        }
        else{
            for(int i=1;i<=8;i++){
                if(duration==i) return i;
            }
        }
        return 0;
    }

}
