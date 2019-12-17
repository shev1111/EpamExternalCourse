package task3.task31.model;

import task3.task31.model.entity.AbstractToy;

import java.util.Comparator;

public class Model {
    private PlayingRoom<AbstractToy> playingRoom = new PlayingRoom<>();

    public boolean addToyToPlayingRoom(AbstractToy toy){
        return playingRoom.addToy(toy);
    }

    public AbstractToy[] sortToys(Comparator<AbstractToy> comparator){
        return playingRoom.sort(comparator);
    }

    public int getTotalPriceOfToys(){
        return playingRoom.getGeneralToysPrice();
    }

    public AbstractToy[] selectToysByPriceAgeGender(int price, int age, String gender){
        return playingRoom.getToysByParameters(price,age,gender);
    }
}
