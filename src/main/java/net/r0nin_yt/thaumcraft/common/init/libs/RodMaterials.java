package net.r0nin_yt.thaumcraft.common.init.libs;



public enum RodMaterials implements ThaumcraftRodMaterial {
    WOOD       ("wood",      25),
    GREATWOOD  ("gold",      50),
    SILVERWOOD ("thaumium",  100),

    ELEMENTAL  ("elemental", 75);





    private final String name;
    private final int visCapacity;

    RodMaterials(String name, int visCapacity) {
        this.name = name;
        this.visCapacity = visCapacity;
    }



    @Override
    public String getMaterialName() {
        return name;
    }

    @Override
    public int getVisCapacity() {
        return visCapacity;
    }

}
