package com.cjh.test;

import com.cjh.entity.*;


public class SqaudOperationTest {

    /*
    *
    * add Squad
    * */

    public String addSquad(Player player, String name) {
        Squad squad=new Squad(name);

        for(int i=0;i<player.getSquadList().size();i++){
            if(player.getSquadList().get(i).getName().equals(name)){

                return "usedName";
            }
        }
        player.getSquadList().add(squad);
        return "success";
    }

    /*
     *
     * delete Squad
     * */
    public String deleteSquad(Player player, String name){

        for(int i=0;i<player.getSquadList().size();i++){
            if(player.getSquadList().get(i).getName().equals(name)){
                player.getSquadList().remove(i);
                return "success";
            }
        }
        return "failed";

    }

    /*
     *
     * edit Squad name
     * */
    public String editSquad(Player player, String oldname, String newname){
        for(int i=0;i<player.getSquadList().size();i++){
            if(player.getSquadList().get(i).getName().equals(oldname)){
                player.getSquadList().get(i).setName(newname);
                return "success";
            }
        }
        return "failed";

    }

    /*
     *
     * list Squad members
     * */
    public void listSquadmembers(Player player, String squadName){

        for(int i=0;i<player.getSquadList().size();i++){
            if(player.getSquadList().get(i).getName().equals(squadName)){
                if(player.getSquadList().get(i).getCaptain()==null){
                    System.out.println("1 . Captain: Empty");
                }
                else{
                    System.out.println("1 . Captain: "+ player.getSquadList().get(i).getCaptain().getName());
                }

                if(player.getSquadList().get(i).getHierophant()==null) {
                    System.out.println("2 . Hierophant: Empty");
                }
                else{
                    System.out.println("2 . Hierophant: " + player.getSquadList().get(i).getHierophant().getName());
                }
                for(int j=0;j<8;j++){

                    if(player.getSquadList().get(i).getMemberList().get(j)==null){
                        System.out.println((j+3)+" . member: Empty");

                    }
                    else{

                        System.out.println((j+3)+" . member: "+player.getSquadList().get(i).getMemberList().get(j).getName());
                    }
                }
            }
        }

    }

    /*
     *
     * create Captain, Hierophant and members for player
     * */
    public void createSquadMembersForPlayer(Player player){

        Captain captain1=new Captain("Captain1");
        Captain captain2=new Captain("Captain2");
        Captain captain3=new Captain("Captain3");
        player.getCaptainList().add(captain1);
        player.getCaptainList().add(captain2);
        player.getCaptainList().add(captain3);

        Hierophant hierophant1=new Hierophant("Hierophant1");
        Hierophant hierophant2=new Hierophant("Hierophant2");
        Hierophant hierophant3=new Hierophant("Hierophant3");
        player.getHierophantList().add(hierophant1);
        player.getHierophantList().add(hierophant2);
        player.getHierophantList().add(hierophant3);

        Member member1=new Member("member1");
        Member member2=new Member("member2");
        Member member3=new Member("member3");
        Member member4=new Member("member4");
        Member member5=new Member("member5");
        Member member6=new Member("member6");
        Member member7=new Member("member7");
        Member member8=new Member("member8");
        Member member9=new Member("member9");
        Member member10=new Member("member10");
        Member member11=new Member("member11");
        player.getMemberList().add(member1);
        player.getMemberList().add(member2);
        player.getMemberList().add(member3);
        player.getMemberList().add(member4);
        player.getMemberList().add(member5);
        player.getMemberList().add(member6);
        player.getMemberList().add(member7);
        player.getMemberList().add(member8);
        player.getMemberList().add(member9);
        player.getMemberList().add(member10);
        player.getMemberList().add(member11);
    }

    /*
     *
     * show player's captain list
     * */
    public void showCaptainList(Player player){
        System.out.println("This is your Captain list");
        for(int i=0;i<player.getCaptainList().size();i++){
            System.out.println(i+" ."+player.getCaptainList().get(i).getName());
        }
    }

    /*
     *
     * show player's hierophant list
     * */
    public void showhierophantList(Player player){
        System.out.println("This is your hierophant list");
        for(int i=0;i<player.getHierophantList().size();i++){
            System.out.println(i+" ."+player.getHierophantList().get(i).getName());
        }
    }

    /*
     *
     * show player's member list
     * */
    public void showMemberList(Player player){
        System.out.println("This is your Member list");
        for(int i=0;i<player.getMemberList().size();i++){
            System.out.println(i+" ."+player.getMemberList().get(i).getName());
        }
    }

    /*
     *
     * update Captain
     * */
    public void updateCaptain(Player player, int squadIndex, int cpatainIndex){

        player.getSquadList().get(squadIndex).setCaptain(player.getCaptainList().get(cpatainIndex));

    }

    /*
     *
     * update Hierophant
     * */
    public void updateHierophant(Player player, int squadIndex, int hierophantIndex){

        player.getSquadList().get(squadIndex).setHierophant(player.getHierophantList().get(hierophantIndex));

    }

    /*
     *
     * update Member
     * */
    public String updateMember(Player player, int squadIndex, int memberIndex, int squadmemposition){

        for(int i=0;i<player.getSquadList().get(squadIndex).getMemberList().size();i++){
            if(player.getSquadList().get(squadIndex).getMemberList().get(i)!=null) {
                if (player.getSquadList().get(squadIndex).getMemberList().get(i).getName()
                        .equals(player.getMemberList().get(memberIndex).getName())) {
                    return "rename";

                }
            }
        }

        player.getSquadList().get(squadIndex).setSingleMember(player.getMemberList().get(memberIndex), squadmemposition);
        return "success";

    }

    /*
     *
     * remove Captaion
     * */
    public void removeCaptain(Player player, int squadIndex){
        player.getSquadList().get(squadIndex).setCaptain(null);
    }

    /*
     *
     * remove Hierophant
     * */
    public void removeHierophant(Player player, int squadIndex){
        player.getSquadList().get(squadIndex).setHierophant(null);
    }

    /*
     *
     * remove Normal Member
     * */
    public void removeMember(Player player, int squadIndex, int memberIndex){
        player.getSquadList().get(squadIndex).removeSingleMember(player.getSquadList().get(squadIndex)
                .getMemberList().get(memberIndex),memberIndex);
    }

    /*
    *
    * list Captain and Hierophant
    * */
    public void listCaptainAndHierophant(Player player, int squadIndex){
        if(player.getSquadList().get(squadIndex).getCaptain()!=null){
            System.out.println("1 ."+player.getSquadList().get(squadIndex).getCaptain().getName());
        }
        else {
            System.out.println("no Captain");
        }
        if(player.getSquadList().get(squadIndex).getHierophant()!=null){
            System.out.println("2 ."+player.getSquadList().get(squadIndex).getHierophant().getName());
        }
        else{
            System.out.println("no Hierophant");
        }

    }

    /*
    *
    * create weapons for the player
    * */
    public void createWeaponsForPlayer(Player player){
        Weapon weapon1=new Weapon("weapon1");
        Weapon weapon2=new Weapon("weapon2");
        Weapon weapon3=new Weapon("weapon3");
        Weapon weapon4=new Weapon("weapon4");
        Weapon weapon5=new Weapon("weapon5");
        Weapon weapon6=new Weapon("weapon6");
        Weapon weapon7=new Weapon("weapon7");
        Weapon weapon8=new Weapon("weapon8");

        player.getWeaponList().add(weapon1);
        player.getWeaponList().add(weapon2);
        player.getWeaponList().add(weapon3);
        player.getWeaponList().add(weapon4);
        player.getWeaponList().add(weapon5);
        player.getWeaponList().add(weapon6);
        player.getWeaponList().add(weapon7);
        player.getWeaponList().add(weapon8);
    }

    /*
     *
     * show weapons of the user
     * */
    public void showWeapons(Player player){
        System.out.println("This is your Weapon list");
        for(int i=0;i<player.getWeaponList().size();i++){
            System.out.println(i+" ."+player.getWeaponList().get(i).getName());
        }
    }

    /*
     *
     * update Captain Weapon
     * */
    public String updateCpatainWeapon(Player player, int squadIndex, int weaponNum, int selectedWeaponNum){
        for(int i=0;i<player.getSquadList().get(squadIndex).getCaptain().getWeapon().size();i++) {
            if (player.getSquadList().get(squadIndex).getCaptain().getWeapon().get(i) != null) {
                if (player.getSquadList().get(squadIndex).getCaptain().getWeapon().get(i).getName()
                        .equals(player.getWeaponList().get(selectedWeaponNum).getName())) {
                    return "rename";
                }
            }
        }
        player.getSquadList().get(squadIndex).getCaptain().
                setSingleWeapon(player.getWeaponList().get(selectedWeaponNum),weaponNum);
        return "success";

    }

    /*
    *
    * show all weapons of Captain
    * */
    public void showAllWeaponsOfCaptain(Player player, int squadIndex)
    {
        if(player.getSquadList().get(squadIndex).getCaptain()
                .getWeapon().get(0)==null) {
            System.out.println("1 . empty weapon");
        }
        else{

            System.out.println("1 ." + player.getSquadList().get(squadIndex).getCaptain()
                    .getWeapon().get(0).getName());
        }
        if(player.getSquadList().get(squadIndex).getCaptain()
                .getWeapon().get(1)==null) {
            System.out.println("2 . empty weapon");
        }
        else {
            System.out.println("2 ." + player.getSquadList().get(squadIndex).getCaptain()
                    .getWeapon().get(1).getName());
        }
    }
}
