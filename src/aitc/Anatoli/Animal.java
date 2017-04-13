package aitc.Anatoli;

/**
 * Created by Studenta on 13-Apr-17.
 */
public class Animal {

    this.isMammal = isMammal ;
    this.ownerName = ownerName;
    this.isHungry = isHungry;


}


   public void setHungry (boolean hungry)  { isHungry = hungry;  }

   public void setHungry (String food) {

       if ("meat" == food) {

           this.isHungry = false;
       } else if ("plant" == food) {

           this.isHungry = false;
       } else {

           this.isHungry = true;
       }

   }

   public void setOwnerName (String ownerName) {this.ownerName = ownerName;  }

   public String getOwnerName () {return getOwnerName; }

   public boolean getHungry() {