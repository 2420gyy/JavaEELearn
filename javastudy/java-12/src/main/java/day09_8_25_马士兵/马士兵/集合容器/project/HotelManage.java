package day09_8_25_马士兵.马士兵.集合容器.project;

import java.util.ArrayList;



public class HotelManage {
    //属性多个房间
    ArrayList<Room> rooms;

    public HotelManage() {
        //初始化
        init();
    }

    public void init() {
//        创建集合
        rooms = new ArrayList<>();
//        创建房间对象
        for(int i=0;i<=300;i+=100) {
            for (int index = 1080+i; index <= 1089+i; index++) {
                if (index % 10 == 4) {
                    continue;
                }
                //System.out.println(index);
                if(index /100 ==10 || index /100 ==11){
                    Room room = new Room(index, Room.ROOM_TYPE_SINGLE, Room.ROOM_STATE_FREE);
                    rooms.add(room);
                }
                if(index /100 ==12 || index /100 ==13){
                    Room room = new Room(index, Room.ROOM_TYPE_STANDARD, Room.ROOM_STATE_FREE);
                    rooms.add(room);
                }
            }
        }
        for(Room room : rooms){
            int id = room.id;
            if (id%10==0||id%10==6||id%10==9){
                room.type=Room.ROOM_TYPE_BUSSINESS;
            }
            if (id%10==8){
                room.type=Room.ROOM_TYPE_PERSINDENT;
            }
        }
        for(Room room:rooms){
            System.out.println(room.id+"-"+room.type);
        }

    }

    public static void main(String[] args) {
        HotelManage hotelManage = new HotelManage();
    }

}
