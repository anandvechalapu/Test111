@Repository
public interface ViewersRepository extends JpaRepository<Viewers, Long> { 
 
    List<Viewers> findAllByInvoices(String invoices);
    List<Viewers> findAllByDeliveryNotes(String deliveryNotes);
    List<Viewers> findAllByCreditNotes(String creditNotes);
    List<Viewers> findAllByCreditProcessed(String creditProcessed);
    List<Viewers> findAllByGoodsSupplied(String goodsSupplied);
    List<Viewers> findAllByNewspaperRecall(String newspaperRecall);
    List<Viewers> findAllByMagazineRecall(String magazineRecall);
    List<Viewers> findAllBySalesPoint(String salesPoint);
    List<Viewers> findAllByInmRebateCredit(String inmRebateCredit);
    List<Viewers> findAllByAccountNumber(String accountNumber);
    List<Viewers> findAllByDateBetween(Date fromDate, Date toDate);
    List<Viewers> findAllByInteractionType(String interactionType);
    List<Viewers> findAllByLastTwoYearReport(String lastTwoYearReport);
 
}