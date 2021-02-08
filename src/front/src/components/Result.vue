<template>
    <div>
        <h1 class="mt-4">Результаты анализа</h1>
        <h3>{{firstName + " " +lastName}}</h3>
        <h3>Одобрен кредит(22%) на 3 года на сумму {{threeYear}} с ежемесячным платежом {{threeYearMonthly}}</h3>
        <h3>Одобрен кредит(22%) на 4 года на сумму {{fourYear}} с ежемесячным платежом {{fourYearMonthly}}</h3>
    </div>
</template>

<script>
    import api from "./backend-api"
    export default {
        name: "Result",
        beforeCreate() {
            api.getResult().then(response => {
                this.firstName = response.data.firtName;
                this.lastName = response.data.lastName;
                this.threeYear = response.data.threeYearMonthly.toFixed(2);
                this.threeYearMonthly = response.data.threeYear.toFixed(2);
                this.fourYear = response.data.fourYearMonthly.toFixed(2);
                this.fourYearMonthly = response.data.fourYear.toFixed(2);
            })
        },
        data () {
            return {
                firstName : "",
                lastName: "",
                threeYear : 32000,
                threeYearMonthly : 32000,
                fourYear : 32000,
                fourYearMonthly : 32000
            }
        }
    }
</script>

<style scoped>

</style>