Feature: Portal W-Sys 2.0 Contratos
    #Contrado modelo 41296

    @Smoke
    Scenario: Creating SOJA FOB contract
        Given I access the test wsys new contrato page
        When I fill produto "SOJA EM GRAOS" frete "FOB" other mandatory fields and save
        Then the contract is succesfuly generated

    # Scenario: Creating SOJA CIF contract
    #     Given I access the test wsys new contrato page
    #     When I fill produto "SOJA EM GRAOS" frete "CIF" other mandatory fields and save
    #     Then the contract is succesfuly generated

    # Scenario: Creating SOJA CIF ARMAZEM TERCEIRO contract
    #     Given I access the test wsys new contrato page
    #     When I fill produto "SOJA EM GRAOS" frete "CIF" other mandatory fields and save
    #     Then the contract is succesfuly generated

    # Scenario: Creating MILHO FOB contract
    #     Given I access the test wsys new contrato page
    #     When I fill produto "MILHO EM GRAOS" frete "FOB" other mandatory fields and save
    #     Then the contract is succesfuly generated

    # Scenario: Creating MILHO CIF contract
    #     Given I access the test wsys new contrato page
    #     When I fill produto "MILHO EM GRAOS" frete "CIF" other mandatory fields and save
    #     Then the contract is succesfuly generated

    # Scenario: Creating MILHO CIF ARMAZEM TERCEIRO contract
    #     Given I access the test wsys new contrato page
    #     When I fill produto "SOJA EM GRAOS" frete "CIF" other mandatory fields and save
    #     Then the contract is succesfuly generated