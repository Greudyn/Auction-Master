package am.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author: Greudyn Velasquez.
 * @Datecreation: Apr 24, 2022 7:54:30 PM
 * @FileName: Buyer.java
 * @AuthorCompany: Telefonica
 * @version: 0.1
 * @Description: Entidad de los compradores
 */
public class Buyer implements Serializable {

    private static final long serialVersionUID = 4870115647596875506L;

    private String     name;
    private float      balance;
    private float      maxPercentage;
    private List<Item> items;

    /**
     * @return obtetiene el par�metro: name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param par�metro: name, para ser seteado.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return obtetiene el par�metro: balance.
     */
    public float getBalance() {
        return balance;
    }

    /**
     * @param par�metro: balance, para ser seteado.
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     * @return obtetiene el par�metro: maxPercentage.
     */
    public float getMaxPercentage() {
        return maxPercentage;
    }

    /**
     * @param par�metro: maxPercentage, para ser seteado.
     */
    public void setMaxPercentage(float maxPercentage) {
        this.maxPercentage = maxPercentage;
    }

    /**
     * @return obtetiene el par�metro: items.
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * @param par�metro: items, para ser seteado.
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * @param par�metro: item para ser agregado a la lista.
     */
    public void addItem(Item item) {
        if (Objects.nonNull(this.items)) {
            this.items.add(item);
        } else {
            this.items=new ArrayList<> ();
            this.items.add(item);
        }
    }

    public float sumItems() {
        if (Objects.nonNull(items)) {
            float sum = 0;
            for (Item item : this.items) {
                sum = sum + item.getSellPrice();
            }
            return sum;
        }
        return 0;
    }
}
