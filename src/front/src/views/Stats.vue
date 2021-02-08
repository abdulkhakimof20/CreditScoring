<template>
    <div>
        <b-table striped hover :items="items" :fields="fields"></b-table>
    </div>
</template>

<script>
    import api from "../components/backend-api"

    export default {
        name: "Stats",
        beforeCreate() {
            api.getStats().then(response => {
                response.data.forEach((item) => {
                    var json = {
                        first_name: item.firstname, last_name: item.lastname,
                        date_birth: item.birthDate, passport: item.pasport
                    };
                    this.items.push(json);
                });
            })
        },
        data() {
            return {
                fields: ['first_name', 'last_name', 'date_birth', 'passport'],
                items: [
                ]
            }
        }
    }
</script>

<style scoped>

</style>