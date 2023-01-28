package net.r0nin_yt.thaumcraft.common.init.libs;



public enum CapMaterials implements CapMaterial {
    IRON     ("iron",     -0.10f),
    GOLD     ("gold",      0.00f),
    THAUMIUM ("thaumium",  0.10f),
    VOID     ("void",      0.20f),

    COPPER   ("copper",   -0.15f),
    SILVER   ("silver",    0.05f);





    private final String name;
    private final float visDiscount;

    CapMaterials(String name, float visDiscount) {
        this.name = name;
        this.visDiscount = visDiscount;
    }



    @Override
    public String getMaterialName() {
        return name;
    }

    @Override
    public float getVisDiscount() {
        return visDiscount;
    }
}
