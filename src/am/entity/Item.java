package am.entity;

import java.io.Serializable;

/**
 * @Author: Greudyn Velasquez.
 * @FileName: Item.java
 * @version: 0.1
 * @Description: Entidad para los productos
 */
public class Item implements Serializable {

    private static final long serialVersionUID = -8802227367303994012L;

    private String  name;
    private float   price;
    private float   sellPrice;
    private String  owner;
    private Boolean available;
    private String  buyer;
    private Boolean auctionInProcess = Boolean.FALSE;

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
     * @return obtetiene el par�metro: price.
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param par�metro: price, para ser seteado.
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return obtetiene el par�metro: sellPrice.
     */
    public float getSellPrice() {
        return sellPrice;
    }

    /**
     * @param par�metro: sellPrice, para ser seteado.
     */
    public void setSellPrice(float sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * @return obtetiene el par�metro: owner.
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param par�metro: owner, para ser seteado.
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return obtetiene el par�metro: available.
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * @param par�metro: available, para ser seteado.
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * @return obtetiene el par�metro: buyer.
     */
    public String getBuyer() {
        return buyer;
    }

    /**
     * @param par�metro: buyer, para ser seteado.
     */
    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    /**
     * @return obtetiene el par�metro: auctionInProcess.
     */
    public Boolean getAuctionInProcess() {
        return auctionInProcess;
    }

    /**
     * @param par�metro: auctionInProcess, para ser seteado.
     */
    public void setAuctionInProcess(Boolean auctionInProcess) {
        this.auctionInProcess = auctionInProcess;
    }

}
