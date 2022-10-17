# Yoni Herlina Siahaan


# QE-A

Introduction CI/CD 

- Continous Intregration
    1. Marupakan Praktik mengintegritaskan kode dalam repositori bersama dan membangun/menguji setiap perubahan secara otomatis, sedini mungkin - biasanya beberapa kali sehari
    2. kelebihan integrasi dengan kontrol versi
    
    Continuous Integretion 
    
    Bagian Delivery :
    
    1. Builds
    2. test
    3. Acceptance Test
    4. Deploy to staging
    5. Deploy to Production Production ⇒ **Manual** 
    
    Bagian Deployment:
    
     Builds
    
    1. test
    2. Acceptance Test
    3. Deploy to staging
    4. Deploy to Production Production ⇒ **Automatic** 
    
- Continous Delivery / Deployment
    1. Continous Delivery menambahkan perangkat lunak dapat diliris ke produksi kapan saja, seringkali dengan secara otomatis mendorang perubahan ke sistem staging.
    2. Deployment berkelanjutan melangkah lebuh jauh dan mendorong perubahan ke produksi secara otomatis.
    
- What Makes for Good CI
    1. Decoupled Stages
        
        Setiap langkah dalam CI harus melakukan tugas sendiri yang berfokus.
        
    2. Repeatable
        
        Otomatis dengan cara yang dapat diulang secara konsisten
        
        Alat harus bekerja untuk pengembang loka juga.
        
    3. Fail Fast
        
        Gagal pada masuk pertama.
        
    4. Design with system in mind
        
        cover as many parts of a deployment as possible, such as : Application, Infrastructure, Confuguration, Data.
        
    5. Pipelines
        
        Continually increase confidence as you move towards production.
        
    6. Globally unique versions
        
        Know the state of the system at any time
        
        Be able to demonstrate difference betwen and future state.
        
- CI/CD Process
    
    Commit, Build, Test, Deploy
    
- Benefits and Costs from Implementing
    1. Detecting bug in early stage
    2. Reduces bug colint
    3. Development process more transparent
    4. Efficent
- Benefits of implementing CD
    1. Reduce the risk
    2. Painless deployment 
    3. Reduces costs
    4. Automated and transparent process
    5. Releases more Frequently
    6. Write automated test
    7. server for automated test
    8. Merge the code as often as possible
- Continuous Delivery / Deployment costs
    
    Strong folindations in CI
    
    Need Highest quality test
    
    Documentation needa to be Updated frequently
    
- CI/CD Tools
    1. Jenkins
    2. Bamboo
    3. Circleci
    4. AWS CodeBuild
    5. Azure DevOps
    6. CICD
    7. Travis CI
    8. GitHud Actions