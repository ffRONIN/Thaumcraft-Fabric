package net.r0nin_yt.thaumcraft.common.init.item.items;

import net.r0nin_yt.thaumcraft.common.init.Register;
import net.r0nin_yt.thaumcraft.common.init.item.TCItem;
import net.devtech.arrp.json.lang.JLang;
import net.devtech.arrp.json.models.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import static net.r0nin_yt.thaumcraft.Thaumcraft.RESOURCE_PACK;


public class WandItem extends TCItem {

    private final String rod, cap, type;


    public WandItem(Item item, String name, String rod, String cap, String type) {
        super(item, name);
        this.rod = rod;
        this.cap = cap;
        this.type = type;
    }

    @Override
    public void model() {

        // lang translation testing
        RESOURCE_PACK.addLang(
                new Identifier("thaumcraft:ru_ru"),
                new JLang().item(
                        new Identifier("thaumcraft:wand"),
                        // TODO
                        // problems with charset
                        "Покрытый таум-металлом великодревесный жезл"
                )
        );
        RESOURCE_PACK.addLang(
                new Identifier("thaumcraft:en_us"),
                new JLang().item(
                        new Identifier("thaumcraft:wand"),
                        "Thaumium capped Greatwood Wand"
                )
        );

        RESOURCE_PACK.addModel(
                new JModel()
                        .textures(
                                new JTextures()
                                        .var("0", "thaumcraft:models/" + rod)
                                        .var("1", "thaumcraft:models/" + cap)
                                        .var("particle", "thaumcraft:models/" + rod)
                        )
                        .element(
                                // top cap
                                new JElement()
                                        .from(6.5f, 14.0f, 6.5f)
                                        .to  (9.5f, 16.0f, 9.5f)
                                        .faces(
                                                new JFaces()
                                                        .north( new JFace("1").uv(2.0f, 3.5f, 4.0f, 4.5f) )
                                                        .east ( new JFace("1").uv(0.0f, 3.5f, 2.0f, 4.5f) )
                                                        .south( new JFace("1").uv(2.0f, 3.5f, 4.0f, 4.5f) )
                                                        .west ( new JFace("1").uv(0.0f, 3.5f, 2.0f, 4.5f) )
                                                        .up   ( new JFace("1").uv(2.0f, 0.0f, 3.0f, 1.0f) )
                                                        .down ( new JFace("1").uv(1.0f, 0.0f, 2.0f, 1.0f) )
                                        ),

                                // rod
                                new JElement()
                                        .from (7.0f,  2.0f, 7.0f)
                                        .to   (9.0f, 14.0f, 9.0f)
                                        .faces(
                                                new JFaces()
                                                        .north( new JFace("0").uv(2.0f, 5.0f, 4.0f, 14.0f) )
                                                        .east ( new JFace("0").uv(0.0f, 5.0f, 2.0f, 14.0f) )
                                                        .south( new JFace("0").uv(2.0f, 5.0f, 4.0f, 14.0f) )
                                                        .west ( new JFace("0").uv(0.0f, 5.0f, 2.0f, 14.0f) )
                                                        .up   ( new JFace("0").uv(1.0f, 4.0f, 2.0f,  5.0f) )
                                                        .down ( new JFace("0").uv(2.0f, 4.0f, 3.0f,  5.0f) )
                                        ),

                                // bot cap
                                new JElement()
                                        .from(6.5f, 0.0f, 6.5f)
                                        .to  (9.5f, 2.0f, 9.5f)
                                        .faces(
                                                new JFaces()
                                                        .north( new JFace("1").uv(0.0f, 1.0f, 2.0f, 2.0f) )
                                                        .east ( new JFace("1").uv(2.0f, 1.0f, 4.0f, 2.0f) )
                                                        .south( new JFace("1").uv(2.0f, 1.0f, 4.0f, 2.0f) )
                                                        .west ( new JFace("1").uv(0.0f, 1.0f, 2.0f, 2.0f) )
                                                        .up   ( new JFace("1").uv(1.0f, 0.0f, 3.0f, 1.0f) )
                                                        .down ( new JFace("1").uv(2.0f, 0.0f, 2.0f, 1.0f) )
                                        )
                        )
                        .display(
                                new JDisplay()
                                        .setThirdperson_righthand( new JPosition().scale(0.6f, 0.6f, 0.6f) )
                                        .setThirdperson_lefthand ( new JPosition().scale(0.6f, 0.6f, 0.6f) )
                                        .setFirstperson_righthand( new JPosition().translation(0.0f, 1.0f, 0.0f).scale(0.6f, 0.6f, 0.6f) )
                                        .setFirstperson_lefthand ( new JPosition().translation(0.0f, 1.0f, 0.0f).scale(0.6f, 0.6f, 0.6f) )
                                        .setGround               ( new JPosition().scale(0.6f, 0.6f, 0.6f) )
                                        .setGui                  ( new JPosition().scale(0.8f, 0.8f, 0.8f).rotation(-30.0f, -30.0f, -45.0f) )
                                        .setHead                 ( new JPosition().translation(0.0f, 7.5f, -0.5f).rotation( 90.0f,   0.0f,  90.0f) )
                        ),

                new Identifier("thaumcraft:item/wand")

        );

        // TODO
        // future identifier of model
        // String.format("thaumcraft:item/%s_%s_%s", type, rod.split("rod_")[1], cap.split("cap_")[1]);

    }

    @Override
    public void register() {
        if (color() == 0x000000)
            setItem( Register.registerItem(name(), item()) );
        else
            setItem( Register.registerItem(name(), item(), color()) );

        setRegistered(true);
    }

    @Override
    public void load() {
        model();
        register();
    }

}
