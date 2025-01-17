package com.fribbels.model;

import com.fribbels.enums.StatType;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class AugmentedStats {

    @SerializedName("Attack") private int attack;
    @SerializedName("AttackPercent") private int attackPercent;
    @SerializedName("CriticalHitChancePercent") private int critRate;
    @SerializedName("CriticalHitDamagePercent") private int critDamage;
    @SerializedName("Defense") private int defense;
    @SerializedName("DefensePercent") private int defensePercent;
    @SerializedName("EffectResistancePercent") private int effectResistance;
    @SerializedName("EffectivenessPercent") private int effectiveness;
    @SerializedName("Health") private int health;
    @SerializedName("HealthPercent") private int healthPercent;
    @SerializedName("Speed") private int speed;
    private StatType mainType;
    private int mainValue;
}
