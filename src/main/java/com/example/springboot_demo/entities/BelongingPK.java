package com.example.springboot_demo.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable // encapsulamento de dois atributos em uma classe
public class BelongingPK {

    @ManyToOne // mapeamento do objeto relacional
    @JoinColumn(name= "game_id") // configurar nome da chave estrangeira
    private Game game;

    @ManyToOne
    @JoinColumn(name= "list_id")
    private GameList list;

    public BelongingPK() {}

    public BelongingPK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.game);
        hash = 67 * hash + Objects.hashCode(this.list);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BelongingPK other = (BelongingPK) obj;
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        return Objects.equals(this.list, other.list);
    }

    
}
