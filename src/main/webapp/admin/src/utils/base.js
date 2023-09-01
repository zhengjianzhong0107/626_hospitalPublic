const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmf03um/",
            name: "ssmf03um",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmf03um/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "医院门诊互联电子病历管理信息系统"
        } 
    }
}
export default base
