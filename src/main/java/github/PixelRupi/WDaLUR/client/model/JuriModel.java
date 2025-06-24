// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
package github.PixelRupi.WDaLUR.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import github.PixelRupi.WDaLUR.WDaLUR;
import github.PixelRupi.WDaLUR.entity.Juri;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class JuriModel<T extends Juri> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(WDaLUR.MODID, "gierek"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart legs;
	private final ModelPart rightleg;
	private final ModelPart leftleg;
	private final ModelPart hands;
	private final ModelPart lefthand;
	private final ModelPart righthand;

	public JuriModel(ModelPart root) {
		this.body = root.getChild("body");
		this.head = this.body.getChild("head");
		this.legs = this.body.getChild("legs");
		this.rightleg = this.legs.getChild("rightleg");
		this.leftleg = this.legs.getChild("leftleg");
		this.hands = this.body.getChild("hands");
		this.lefthand = this.hands.getChild("lefthand");
		this.righthand = this.hands.getChild("righthand");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -7.0F, 0.0F, 8.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 14.0F, -2.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 16).addBox(-3.0F, -24.0F, -1.0F, 6.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 10.0F, 2.0F));

		PartDefinition legs = body.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(-4.0F, 10.0F, 2.0F));

		PartDefinition rightleg = legs.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(8, 27).addBox(1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftleg = legs.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(16, 27).addBox(-3.0F, -7.0F, -2.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition hands = body.addOrReplaceChild("hands", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lefthand = hands.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(20, 16).addBox(0.0F, -6.0F, 2.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition righthand = hands.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(0, 27).addBox(-10.0F, -6.0F, 2.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}