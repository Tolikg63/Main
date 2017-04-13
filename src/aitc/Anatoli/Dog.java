package aitc.Anatoli;

/**
 * Created by Studenta on 13-Apr-17.
 */
public class Dog extends Animal {
          private boolean isFriendly;
          private boolean isBarking;
          private boolean isFemale;


}

  public Dog(boolean isMammal),
             String ownerName,
             boolean isHungry,
             boolean isBarking,
             boolean isFriendly,
             boolean isFemale,{

    super(isMammal, ownerName, isHungry);

    this.isBarking = isBarking;
    this.isFriendly = isFriendly;

    this.isFemale = isFemale;

