<<<<<<< HEAD:src/main/java/Equipment.java
=======
package circus.stuff;

import circus.Asset;

>>>>>>> upstream/main:src/main/java/circus/stuff/Equipment.java
public abstract class Equipment implements Asset {
    protected int purchasePrice;

    public Equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
