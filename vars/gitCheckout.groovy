// simple getCheckout function

def call(Map stageParams)
{

    checkout([$class: 'GitSCM', branches: [[name: stageParams.branch]], userRemoteConfigs: [[credentialsId: stageParams.credId, url: stageParam.url]]])

}


