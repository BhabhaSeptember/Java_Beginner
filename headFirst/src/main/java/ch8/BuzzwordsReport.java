package ch8;

class BuzzwordsReport extends Report {
    
    @Override
  void runReport() {
//'super' keyword calls superclass version of method in subclass override      
    super.runReport();
    buzzwordCompliance();
    printReport();
  }

  void buzzwordCompliance() {}
}