package kurisu.code.designpatterns.creational.flyweight;

import lombok.Getter;

public class PointIcon {
    @Getter private final PointType type; // 4 bytes
    @Getter private final byte[] icon; // 20 KB
    
    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }

    
}
