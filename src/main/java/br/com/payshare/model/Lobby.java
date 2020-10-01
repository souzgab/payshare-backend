package br.com.payshare.model;

import br.com.payshare.interfaces.Taxes;
import br.com.payshare.repository.UserRepository;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Lobby implements Taxes {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int lobbyId;
    private String lobbyDescription, orderDescription;
    private Double amount;
    private Date orderDate;

    @OneToMany
    private List<UserPf> user;

    public void addUserLobby(UserPf userPf){ user.add(userPf);}

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getLobbyId() {
        return lobbyId;
    }

    public void setLobbyId(int lobbyId) {
        this.lobbyId = lobbyId;
    }

    public String getLobbyDescription() {
        return lobbyDescription;
    }

    public void setLobbyDescription(String lobbyDescription) {
        this.lobbyDescription = lobbyDescription;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<UserPf> getUser() {
        return user;
    }

    public void setUser(List<UserPf> user) {
        this.user = user;
    }
}
