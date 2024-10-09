class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        //knightAwake = true -> fastAttack = false (!knightAwake)
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        //If at least one is awake, spy is not possible
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        //If archer is not awake and prisoner is awake, signal is possible
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return !archerIsAwake && (petDogIsPresent || (!knightIsAwake && prisonerIsAwake));
    }
}