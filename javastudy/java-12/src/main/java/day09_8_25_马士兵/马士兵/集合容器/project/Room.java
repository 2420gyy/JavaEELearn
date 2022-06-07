package day09_8_25_马士兵.马士兵.集合容器.project;

public class Room {
    //房间编号
    int id;
    //房间类型 0单人间 1标准房 2商务房 3总统套房
    int type;
    //房间状态 0空闲 1入住 2 维修
    int state;

    static int ROOM_TYPE_SINGLE = 0;
    static int ROOM_TYPE_STANDARD = 1;
    static int ROOM_TYPE_BUSSINESS = 2;
    static int ROOM_TYPE_PERSINDENT = 3;

    static int ROOM_STATE_FREE =0;
    static int ROOM_STATE_IN =1;
    static int ROOM_STATE_REPAIRED =2;

    public Room(){}

    public Room(int id, int type, int state) {
        this.id = id;
        this.type = type;
        this.state = state;
    }
}
