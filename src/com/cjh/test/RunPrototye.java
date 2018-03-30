package com.cjh.test;

import com.cjh.entity.Player;

import java.util.Scanner;

public class RunPrototye {

    public static Scanner input = new Scanner(System.in);

    public static SqaudOperationTest sqopt=new SqaudOperationTest();

    public static int flag=1;

    public static void main(String[] args) {

        String name="cjh";
        Player player = new Player(name);
        sqopt.createSquadMembersForPlayer(player);
        sqopt.createWeaponsForPlayer(player);


        while(true){
            flag=1;
            System.out.println("---------------------------------------");
            System.out.println("This is your Squad list:");
            printSquadList(player);
            System.out.println("---------------------------------------");
            System.out.println("You can select These operations:");
            System.out.println("1. Add a new squad");
            System.out.println("2. Delete a squad");
            System.out.println("3. Edit a squad");
            System.out.println("4. Add member for a squad");
            System.out.println("5. Remove member for a squad");
            System.out.println("6. Update weapons for a Captain and Hierophant");
            System.out.println("0. exit squad module");
            System.out.println("---------------------------------------");
        int num = input.nextInt();

        if(num==1){
            System.out.println("--------------add squad--------------");
            while(true) {
                System.out.println("Please input squad name");
                String squadName = input.next();
                if (sqopt.addSquad(player, squadName).equals("success")) {
                    System.out.println("add squad success, this is your Sqauad list:");
                    printSquadList(player);
                    break;

                } else if (sqopt.addSquad(player, squadName).equals("usedName")) {
                    System.out.println("your have a squad used the same name, please input another name");
                } else {
                    System.out.println("Add squad fail, unknown reason");
                }
            }
        }
        else if(num==2){
            System.out.println("--------------delete a squad--------------");
            System.out.println("Please input squad number which you want to delete");
            printSquadList(player);
            int number = input.nextInt();
            String squadName=player.getSquadList().get(number).getName();
            if(sqopt.deleteSquad(player, squadName).equals("success")){
                System.out.println("delete squad success, this is your squad list");
                printSquadList(player);
            }
            else if(sqopt.deleteSquad(player, squadName).equals("failed")){
                System.out.println("delete squad failed, unknown reason");
            }
        }
        else if(num==3){
            System.out.println("--------------squad name edit--------------");
            System.out.println("Please input squad number which you want to delete");
            printSquadList(player);
            int number = input.nextInt();
            String squadName=player.getSquadList().get(number).getName();
            System.out.println("Please input new name");
            String newname=input.next();
            if(sqopt.editSquad(player, squadName, newname).equals("success")){
                System.out.println("edit squad name success, this is your squad list");
                printSquadList(player);
            }
            else if(sqopt.editSquad(player, squadName, squadName).equals("failed")){
                System.out.println("edit squad name failed, unknown reason");
            }
        }
        else if(num==4){
            if(flag==0){continue;}
            if(player.getSquadList().size()==0){
                System.out.println("please create squad first");
                continue;
            }
            System.out.println("--------------add squad member--------------");

            System.out.println("Please select a squad");
            printSquadList(player);
            int number = input.nextInt();
            String squadName=player.getSquadList().get(number).getName();

            while(true) {
                sqopt.listSquadmembers(player, squadName);
                System.out.println("Please select a number to update the squad member");
                System.out.println("return select 0");
                int memNumber = input.nextInt();
                if (judgeInputNumber(0, 10, memNumber)) {

                    if(memNumber==1){
                        if(player.getCaptainList().size()==0){
                            System.out.println("You have no Captain can be added");
                            continue;
                        }
                        sqopt.showCaptainList(player);
                        System.out.println("Please select a Captain for the squad");
                        int captainNumber = input.nextInt();
                        if(judgeInputNumber(0, player.getCaptainList().size(), captainNumber)){
                            sqopt.updateCaptain(player, number, captainNumber);
                        }
                        else{
                            System.out.println("Please input correct Captain number");
                        }

                    }
                    else if(memNumber==2){
                        if(player.getHierophantList().size()==0){
                            System.out.println("You have no Hierophant can be added");
                            continue;
                        }
                        sqopt.showhierophantList(player);
                        System.out.println("Please select a Hierophant for the squad");
                        int hierophantNumber = input.nextInt();
                        if(judgeInputNumber(0, player.getHierophantList().size(), hierophantNumber)){
                            sqopt.updateHierophant(player, number, hierophantNumber);
                        }
                        else{
                            System.out.println("Please input correct Hierophant number");
                        }

                    }
                    else if(memNumber==0){
                        flag=0;
                        break;
                    }
                    else{
                        if(player.getMemberList().size()==0){
                            System.out.println("You have no normal Member can be added");
                            continue;
                        }
                        sqopt.showMemberList(player);
                        System.out.println("Please select a normal Member for the squad");
                        int memberNumber = input.nextInt();
                        if(judgeInputNumber(0, player.getMemberList().size(), memberNumber)){
                            if(sqopt.updateMember(player, number, memberNumber, memNumber-3).equals("rename")){
                                System.out.println("This member is in the team, please choose another one");
                            }
                            else if(sqopt.updateMember(player, number, memberNumber, memNumber-3).equals("success")){
                                continue;
                            }
                        }
                        else{
                            System.out.println("Please input correct normal Member number");
                        }
                    }
                } else {
                    System.out.println("Please choose a correct member number");
                }
            }


        }
        else if(num==5){
            if(flag==0){continue;}
            if(player.getSquadList().size()==0){
                System.out.println("please create squad first");
                continue;
            }
            System.out.println("--------------remove squad member--------------");
            System.out.println("Please select a squad");
            printSquadList(player);
            int number = input.nextInt();
            String squadName=player.getSquadList().get(number).getName();

            while(true){
                sqopt.listSquadmembers(player, squadName);
                System.out.println("Please select a number to remove from the squad member");
                System.out.println("return select 0");
                int memNumber = input.nextInt();
                if (judgeInputNumber(0, 10, memNumber)) {

                    if(memNumber==1 && player.getSquadList().get(number).getCaptain()!=null){

                        sqopt.removeCaptain(player,number);
                    }
                    else if(memNumber==2 && player.getSquadList().get(number).getHierophant()!=null){

                        sqopt.removeHierophant(player,number);

                    }
                    else if(memNumber==0){
                        flag=0;
                        break;
                    }
                    else if (memNumber >2 && player.getSquadList().get(number).getMemberList().get(memNumber-3)!=null){

                        sqopt.removeMember(player,number,memNumber-3);
                    }

                } else {
                    System.out.println("Please choose a correct member number");
                }
            }
        }
        else if(num==6){
            if(flag==0){continue;}
            if(player.getSquadList().size()==0){
                System.out.println("please create squad first");
                continue;
            }
            System.out.println("--------------update weapon--------------");
            System.out.println("Please select a squad");
            printSquadList(player);
            int number = input.nextInt();
            String squadName=player.getSquadList().get(number).getName();
            while(true){
                sqopt.listCaptainAndHierophant(player, number);
                System.out.println("-------------------------------------");
                System.out.println("Please select Captain or Hierophant to update the weapon");
                System.out.println("return select 0");
                int memNumber = input.nextInt();
                if(memNumber==1) {
                    if (player.getSquadList().get(number).getCaptain() != null) {

                        if(player.getWeaponList().size()==0){
                            System.out.println("You have no weapon, please buy first");
                            continue;
                        }
                        sqopt.showAllWeaponsOfCaptain(player,number);
                        int weaponnum=input.nextInt();
                        sqopt.showWeapons(player);
                        int selectedweapon=input.nextInt();

                        if(sqopt.updateCpatainWeapon(player,number, weaponnum-1,selectedweapon).equals("success")){
                            sqopt.showAllWeaponsOfCaptain(player,number);
                            continue;
                        }
                        else if(sqopt.updateCpatainWeapon(player,number, weaponnum-1,selectedweapon).equals("rename")){
                            System.out.println("This weapon has added to the Captain, please choose another one");
                        }

                    }
                    else{
                        System.out.println("Please add Captain first");
                    }
                }
                else if(memNumber==0){
                    flag=0;
                    break;
                }
            }

        }
        else if(num==0){
            System.exit(0);
        }
        }
    }

    public static void printSquadList(Player player){

        for(int i=0;i<player.getSquadList().size();i++){
            System.out.println(i+". "+player.getSquadList().get(i).getName());
        }
    }

    public static boolean judgeInputNumber(int low, int high, int num){
        if(num>=low && num<=high){
            return true;
        }
        else {
            return false;
        }
    }
}
