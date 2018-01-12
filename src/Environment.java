public class Environment {

//  基本的get/set方法
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if(temperature>=0&&temperature<=5)this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
       if(humidity>=0&&humidity<=4) this.humidity = humidity;
    }

    public int getTerrain() {
        return terrain;
    }

    public void setTerrain(int terrain) {
        if(terrain>=1 && terrain<=3)this.terrain = terrain;
    }

    public int getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(int oxygenLevel) {
        if(oxygenLevel>=0 && oxygenLevel<=5)this.oxygenLevel = oxygenLevel;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if(food>=1&&food<=8)this.food = food;
    }
//  get/set结束

//变量定义
    int temperature;
    int humidity;
    int terrain; // 1- water, 2-land, 3-water&land
    int oxygenLevel;
    int food;//[to be finish]
    public static int need_oxy_all[]={0,10,20,30,40,50,60,70};
    public static int need_moi_all[]={0,10,20,30,40,50,60,70};
    public static String need_food_all[]={"单一丰富","单一还行","单一稀少","单一缺乏","多样缺乏","多样稀少","多样还行","多样丰富"};
    public static int need_tem_first_all[]={-60,-30,0,20,30,40,45,50};
    public static int need_tem_second_all[]={-30,0,20,30,40,45,50,100};

    public static int env_oxy_all[]={10,20,30,40};
    public static int env_moi_all[]={40,80,100};
    public static int env_tem_all[]={-60,0,20,40,100};
    public static String env_food_all[]={"单一丰富","单一还行","单一稀少","单一缺乏","多样缺乏","多样稀少","多样还行","多样丰富"};

    Environment(int temperature, int humidity, int terrain, int oxygenLevel, int food){//初始化环境（有参数）
        this.temperature = temperature;
        this.humidity = humidity;
        this.terrain = terrain;
        this.oxygenLevel = oxygenLevel;
        this.food = food;
    }
    Environment(){//初始化环境（默认）
        this.temperature = 3;//20
        this.humidity = 2;//40
        this.terrain = 2;
        this.oxygenLevel = 3;//20
        this.food = 8;
    }
}
