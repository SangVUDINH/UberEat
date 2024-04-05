<template>
    <div class="sidebar">
        side bar
        <div class="linkSideBarBtn1">
            Inscription
            <RouterLink to="/inscription">Inscription</RouterLink>
        </div>

        <div class="linkSideBarBtn2">
            Connexion
            <RouterLink to="/login">Connexion</RouterLink>
        </div>
    </div>

</template>

<style>
    .sidebar {
    height: 100%;
    width: 160px;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    background-color: #ffffff;
    overflow-x: hidden;
    padding-top: 16px;
    }

    .linkSideBarBtn1 {
        background-color: #010101;
        color: #ffffff;
    }
    .linkSideBarBtn2 {
        background-color: #c8c8c8;
    }
</style>