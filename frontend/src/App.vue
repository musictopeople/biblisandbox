<template>
  <div id="app">
    <header>
      <img id="mainlogo" src="@/assets/img/logocrop.png" alt="bilbi text logo">
    </header>
    <div id="nav">
      <router-link v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'My Pets' }">My Pets</router-link>&nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
    </div>
    <router-view />
  </div>
</template>

<style scoped>

#nav {
  display: flex;
  justify-content: center;
  padding: 10px;
}

#app {
  background-color: #c7e5e3;
  font-family: Arial, Helvetica, sans-serif;
  height: 100vh;
  padding: 10px;
}

header {
  text-align: center;
}

a {
  text-decoration: none;
  color: #545454;
}

</style>
