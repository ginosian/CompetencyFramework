package reactive.web;


import com.sun.faces.action.RequestMapping;
import reactive.model.Message;
import reactive.model.MessageAcknowledgement;
import reactive.service.RxJavaService;

@RestController
public class RxJavaController {

	private final RxJavaService aService;

	@Autowired
	public RxJavaController(RxJavaService aService) {
		this.aService = aService;
	}

	@RequestMapping(consumes =  "/handleMessageRxJava", method = RequestMethod.POST)
	public Single<MessageAcknowledgement> handleMessage(@RequestBody Message message) {
		return this.aService.handleMessageSingle(message);
	}

	@RequestMapping(consumes =  "/handleMessageRxJavaObs", method = RequestMethod.POST)
	public Observable<MessageAcknowledgement> handleMessageObs(@RequestBody Message message) {
		return this.aService.handleMessageObservable(message);
	}

}
